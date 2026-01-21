let Student = function(name, age, grade, subjects) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.subjects = subjects;
}

function printStudInfo(student) {
    for(let key in student) {
        console.log(key + ": " + student[key]);
    }
}

let student1 = new Student("saurabh", 80, "A", ["Math", "Science"]);
printStudInfo(student1);