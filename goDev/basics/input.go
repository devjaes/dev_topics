package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Print("Hello, World!\nEnter the firt side of the triangle: ")

	const precision = 2
	var input float64
	var input2 float64
	fmt.Scanln(&input)
	fmt.Print("Then, enter the second side of the triangle: ")
	fmt.Scanln(&input2)

	//Calculate the hypotenuse
	hypotenuse := math.Sqrt(math.Pow(input, 2) + math.Pow(input2, 2))
	fmt.Printf("The hypotenuse is: %.*f\n", precision, hypotenuse)

	//Calculate the area
	area := (input * input2) / 2
	fmt.Printf("The area is: %.*f\n", precision, area)

	//Calculate the perimeter
	perimeter := input + input2 + hypotenuse
	fmt.Printf("The perimeter is: %.*f\n", precision, perimeter)
}
