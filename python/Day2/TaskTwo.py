def averageOfThreeScore(score1, score2, score3):
	if type(score1) == float:
		raise ValueError;
	if type(score1) == str:
		raise ValueError;
	if score1 < 0:
		raise ValueError;
	average = (score1 + score2 + score3) / 3;
	if average >= 90 and average <= 100:
		return 'A';
	elif average >= 80 and average < 90:
		return 'B';
	elif average >= 70 and average < 80:
		return 'C';
	elif average >= 60 and average < 70:
		return 'D';
	else:
		return 'F';
