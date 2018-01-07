//класс пользователя
class Person{
    String first, last
}
//функции без типизированных параметров
def printInfo(first, second){
    println "first name: $first, second name: $second"
}
def printFirstName(user){
    println "user: $user.first"
}
//создаем обьект класса Person с параметрами
def tempPerson = new Person(first: 'Adam', last: 'Smith')


// вызов функции разными способами


/*
printInfo tempPerson.first, tempPerson.last

printFirstName(tempPerson)

printFirstName tempPerson

a = "0123456789"
println(a[1..4])

year = 100

if (year<4) b = 0;
if ((year%4 == 0 & year%100 !=0) || year%400) b = year/4;
else if (year%4 == 0 & year%100 == 0) b = year/4-1;

c = '\u03A9'
println(c)


println(b)*/

double a = 0.1;
double b = 0.2;
int i = 23;

println((char)((int)'\\'+ i))