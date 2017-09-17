

def sss=["первый",2,'третий']

println(sss[1])
println(sss[2])

sss << "xtndthnsq"
println(sss[3])
println(sss[4])

println("размер списка = " + sss.size())

for (e in sss){
    println(e)
}

def amPM = Calendar.getInstance().get(Calendar.AM_PM)
if (amPM == Calendar.AM){
    println("Good morning")
} else {
    println("Good evening")
}
