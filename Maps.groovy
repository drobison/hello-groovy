def employee = [
    'name':'John', 
    'age': 40
    ]
println employee
println employee.name
println employee['age']
println employee.get('age')
println employee.getAt('age')

println employee.size();
employee.put('city','Paris')
println employee

println employee.containsKey('city')
println employee.containsValue('Paris')

println employee.getClass()

def emp2 = employee.clone().clone()
println emp2;

employee.each {key, value ->
    println "$key : $value"
}

employee.eachWithIndex {key, value, i ->
    println "$i | $key : $value"
}

employee.eachWithIndex {entry, i ->
    println "$i | $entry.key : $entry.value"
}

def map1 = ['a':1, 'b':2]
def entries = map1.entrySet()

entries.each {entry ->
    assert entry.key in ['a', 'b']
    assert entry.value in [1,2]
}

employee.clear();
println employee