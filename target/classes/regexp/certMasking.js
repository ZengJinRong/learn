const data = '350181199203202097'

const result = data.replace(/(?<=(^\w{6}\w*))\w(?=(\w*\w{3}$))/g, '*')

console.log(data)
console.log(result)
