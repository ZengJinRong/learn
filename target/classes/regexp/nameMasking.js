const data = '张三啊是大'

const result = data.replace(/(?!(^\S))./g, '*')

console.log(data)
console.log(result)
