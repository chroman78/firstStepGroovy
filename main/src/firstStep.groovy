
javaString = 'Проверка 1'
groovyString = "Ghjdthrf ${javaString} 2"

println(javaString)
println(groovyString)

bigGroovyString = """
  long
   long
    string
""" // Длинная строка с отступами

println(bigGroovyString)

def a = "a"
println a
println a + "12" // конкатенация
println a * 3 // умножение
