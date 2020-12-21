const regExp = new RegExp(/(?!^)(?=(\d{3})+$)/g)
const a = '2020.10.13'

console.log(regExp.test(a))
console.log(regExp[Symbol.match](a))

console.log(regExp[Symbol.replace](a, '#'))
