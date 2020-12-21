const data = '18960880153'

const result = data.replace(/^(\d{3})\d+(\d{4})$/, '$1****$2')

console.log(data)
console.log(result)

