def str = "hello"
def myClosure1 = {name -> println "$str $name"}
myClosure1.call("John")

def myMethod(clos) {
    clos.call("Groovy")
}

myMethod(myClosure1);

def myClosure2 = {
    a,b,c ->
    return (a+b+c)
}

def res = myClosure2(10,20,30)
println res

def myList1 = ["Apples", "Oranges", "Grapes"]
println myList1.each { it }