import axios from 'axios';

const url = import.meta.env.VITE_BACKEND_URL;


const loginUser = async (email, password) => {
    try{
        const response = await axios.post(`${url}/api/users/login`, {email, password});
        console.log('Login response:', response.data);
        return response.data.data.token;
    }
    catch(error){
        console.error('Error logging in user:', error);
        throw error;
    }
}

const resgisterUser = async (name, email, password, role) => {
    try{
        const response = await axios.post(`${url}/api/users/register`, {name, email, password, role});
        return response.data;
    }
    catch(error){
        console.error('Error registering user:', error);
        throw error;
    }
}

const getUserProfile = async (token) => {
    try{
        const response = await axios.get(`${url}/api/users/profile`, {
            headers: {
                'Authorization': `Bearer ${token}`
            }
        });
        return response.data;
    }
    catch(error){
        console.error('Error fetching user profile:', error);
        throw error;
    }
}

const getAllUsers = async (token) => {
    try{
        const response = await axios.get(`${url}/api/users/all-users`, {
            headers: {
                'Authorization': `Bearer ${token}`
            }
        });
        return response.data;
    }
    catch(error){
        console.error('Error fetching all users:', error);
        throw error;
    }
}

export {loginUser, resgisterUser, getUserProfile, getAllUsers};