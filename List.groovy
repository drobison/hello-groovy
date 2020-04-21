def fruits = ["Apples", "Oranges", "Grapes"]
println fruits[1];
println fruits.get(2);

def myList = [1,2,3,['A','B', "Groovy"], 4]
println myList[2]
println myList[3][2]
println myList.contains(2)

println myList.size()
myList.add(10)
myList << 20
println myList
