const prompt = require("prompt-sync")(); 
let itemList = [];
hunterly = true;
while(hunterly){
console.log(`WELCOME TO YOUR GROCERY STORE
		   
		  
		  1.Add item
		  2.Remove item
		  3.Show Available item
		  0.exit`);
let option = parseInt(prompt("Enter your choice: "));
switch(option){
	case 1: 
		let userInput = prompt("Enter item to add: ");
		addMyItem(userInput);
		break;
	case 2: 
		userInput2 = prompt("Enter item to remove: ");
		removeMyItem(userInput2);
		break;
	case 3: 
		console.log(" Available item:");
		showItem();
		break;
	case 0:
	hunterly = false;
	console.log("bye bye");
	break;
	default:
            console.log("Invalid option. Please try again.");	


}
}



function addMyItem(addItem){
		itemList.push(addItem);
		console.log("item added:",itemList);
}
function removeMyItem(removeItem){
		let index = itemList.indexOf(removeItem);
		if(index !== -1){
		itemList.splice(index, 1);
		console.log("item removed:", itemList);
		} else {
		console.log("item not found");
	}
}

function showItem(){
itemList.forEach((item, index) => {
	console.log(`${index + 1}. ${item}`);

});
}
