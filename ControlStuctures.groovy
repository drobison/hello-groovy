def num = 11;

if (num == 10) {
    println("number is 10")
} else {
    println("number is not 10")
}

def x = 10;
def result = "";

switch(x) {
    case 0: 
        result = "x is zero";
        break;
    default:
        result = "invalid number";
}
println(result);

for (int y = 0; y<6; y++) {
    println(y);
}

for(a in 1..5) {
    println a;
}

1.upto(5) {
    println "$it"
}

5.times { println "$it"}

1.step(10, 2) { println "$it"}

def map = ['abc':1, 'def':2, 'xyz':3]; 
x = 0;
for (e in map) {
    println e.key;
    x += e.value;
}
println x;