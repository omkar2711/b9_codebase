import User from '../model/userModel.js';
import jwt from 'jsonwebtoken';
import bcrypt from 'bcrypt';


const loginService = async(email, password) => {
   try{

   }
   catch(error){
         throw new Error('Login failed')
   }
}

const registerService = async(name, email, password, role) => {
    try{

    }
    catch(error){
        throw new Error('Registration failed')
    }
}

export {loginService, registerService};