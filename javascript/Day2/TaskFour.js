function getPump(gallon, miles){
let milesNew = miles + miles;

if(milesNew == gallon){
	return true;
} else {
	return false;
}
}

console.log(getPump(50, 20))