/*1.create a an empty parking lots(list) 
2.create a function to pack car;
3.collect an input 
4.store the input inside the parking lot
5.return "car packed successfully"
6.create a function to remove car packed
7.remove an input in the parking lots  
8.return "car has been removed successfully"
9.create a function to show car park status
10.if car pack is empty return "car pack is empty" else return the list of car in the parking lots*/

const prompt = require("prompt-sync")(); 
let carPack = [];
hunterly = true;
while(hunterly){
console.log(`WELCOME TO HUNTER CAR PACK
		   
		  
		  1.Pack car 
		  2.Remove your packed car
		  3.Show Available car packed
		  0.exit`);
let option = parseInt(prompt("Enter your choice: "));
switch(option){
	case 1: 
		let userInput = prompt("Pack your car: ");
		parkMyCar(userInput);
		break;
	case 2: 
		userInput2 = prompt("Remove your packed car: ");
		removeMyCar(userInput2);
		break;
	case 3: 
		console.log("Show Available car packed:");
		showAvailableSpace();
		break;
	case 0:
	hunterly = false;
	console.log("bye bye");
	break;
	default:
            console.log("Invalid option. Please try again.");	


}
}



function parkMyCar(packCar){
		carPack.push(packCar);
		console.log("car packed sucessfuly:", carPack);
}
function removeMyCar(removeCar){
		let index = carPack.indexOf(removeCar);
		if(index !== -1){
		carPack.splice(index, 1);
		console.log("car removed sucessfuly:", carPack);

}
}

function showAvailableSpace(){
carPack.forEach((car, index) => {
	console.log(`${index + 1}. ${car}`);

});
}
