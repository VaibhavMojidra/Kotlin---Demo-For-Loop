fun main(args: Array<String>) {

	//the loop iterates through the range and prints individual item. To iterate over a range of numbers, we will use a range expression
	for (item in 1..5) {
		println(item)
	}
	//will iterate through another range, but this time it will step down instead of stepping up
	for (item in 5 downTo 1 step 2) {
		println(item)
	}

	var fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

	for (item in fruits) {
		println(item)
	}


	for (index in fruits.indices) {
		println(fruits[index])
	}
}