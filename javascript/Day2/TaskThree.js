function returnDisplay(array){
let count = array.length;

if(count == 0){
	return "no one like this";
} else if(count === 1){
	return `${array},like this`;
} else if(count === 2){
	return `${array[0]},${array[1]},like this`;
}else if(count === 3){
	return `${array[0]},${array[1]} and ${array[2]}like this`;
}else if(count > 3){
	return `${array[0]},${array[1]} and ${array.length - 2} others like this`;
}



}

let array = ["peter", "Paul", "Mark", "Max"];
console.log(returnDisplay(array))