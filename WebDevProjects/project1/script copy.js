let car = {
    name: "Toyota",
    model: "Corolla",
    "model number": 12345,
    year: 2020,
    start : function(){
        return this.name + " " + this.model + " is starting.";
    }
    
};

let electricCar = {
    batteryCapacity : "75kwh",
     __proto__ : car
};


let name = "Aditya";
let age = 21;

console.log(`My name is ${name} and my age is ${age}`);

for(let key in electricCar){
    console.log(key + ":" + electricCar[key]);
}


function Pet(name, age, hungerLevel){
    this.name = name;
    this.age = age;
    this.hungerLevel = hungerLevel;

    this.feed = function(){
        this.hungerLevel--;
        console.log(this.name + " has been fed!")
    }
}

let pet1 = new Pet("Buddy", 3, 7);

pet1.feed();


function Student(name, age, grade, subject){
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.subject = subject;

    this.printInfo = function(){
       console.log(`Name: ${this.name} Age: ${this.age}`);
     
    }
}

let student1 = new Student("Abhishek", 21, 'A', "Maths");
student1.printInfo();

let student2 = new Student("Rushikesh" , 21, 'B' , "History");
student2.printInfo();

