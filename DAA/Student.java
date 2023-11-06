package DAA;

public class Student {
    /*// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract StudentData {
    struct Student {
        string name;
        uint age;
        string major;
    }

    Student[] public students;

    event StudentAdded(string name, uint age, string major);

    fallback() external {
        revert("Invalid function call.");
    }

    function addStudent(string memory name, uint age, string memory major) public {
        Student memory newStudent = Student(name, age, major);
        students.push(newStudent);
        emit StudentAdded(name, age, major);
    }

    function getStudentCount() public view returns (uint) {
        return students.length;
    }

    function getStudent(uint index) public view returns (string memory, uint, string memory) {
        require(index < students.length, "Invalid student index");
        return (students[index].name, students[index].age, students[index].major);
    }
}
*/
    /*// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract BankAccount {
    address public owner;
    uint public balance;

    constructor() {
        owner = msg.sender;
        balance = 0;
    }

    modifier onlyOwner {
        require(msg.sender == owner, "Only the owner can call this function");
        _;
    }

    function deposit(uint amount) public onlyOwner {
        require(amount > 0, "Deposit amount must be greater than 0");
        balance += amount;
    }

    function withdraw(uint amount) public onlyOwner {
        require(amount > 0, "Withdrawal amount must be greater than 0");
        require(amount <= balance, "Insufficient balance");
        balance -= amount;
    }

    function getBalance() public view returns (uint) {
        return balance;
    }
}
*/
}
