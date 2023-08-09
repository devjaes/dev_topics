package main

import "fmt"

func main() {
	fmt.Print("Hello, World!\n")
	fmt.Println("Hello, World!")
	var x = 3
	fmt.Println(x)
	var y int
	fmt.Println(y, "empty int")
	var z string
	fmt.Println(z, "empty string")

	fmt.Printf("%s %s", "Type of x is %T\n", z)

	oeu(2)

	var myarray [3]int = [3]int{1, 2, 3}
	fmt.Println(myarray)

	var myarray2 = [3]int{1, 2, 3}
	fmt.Println(myarray2)

	var myarray3 = [...]int{1, 2, 3}
	fmt.Println(myarray3)

	var myobject = map[string]int{"one": 1, "two": 2}
	fmt.Println(myobject)

	var myobject2 = map[string]int{}
	myobject2["one"] = 1
	myobject2["two"] = 2
	fmt.Println(myobject2)

	var myobject3 = make(map[string]int)
	myobject3["one"] = 1
	myobject3["two"] = 2
	fmt.Println(myobject3)

	var myobject4 = make(map[string]int, 100)
	myobject4["one"] = 1
	myobject4["two"] = 2
	fmt.Println(myobject4)

	o := 1
	fmt.Println(o)

	for i := 0; i < 10; i++ {
		fmt.Println(i)
	}
}

func oeu(oniu int) string {
	return "oeu"
}
