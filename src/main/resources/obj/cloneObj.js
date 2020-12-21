function cloneObj(obj) {
  return Object.create(Object.getPrototypeOf(obj), Object.getOwnPropertyDescriptors(obj))
}


const obj = {
  a: 'a',
  b: {
    value: 'b',
  },
  c: ['c'],
}

const clone = cloneObj(obj)


console.log(JSON.stringify(obj))
console.log(JSON.stringify(clone))

obj.b = {}
obj.c = ['C']

console.log(JSON.stringify(obj))
console.log(JSON.stringify(clone))

clone.b = {}
obj.c.push('D')

console.log(JSON.stringify(obj))
console.log(JSON.stringify(clone))
