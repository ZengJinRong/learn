function decorator(func) {
  return function (...args) {
    console.log('decorator', func)
    return func(...args)
    // return func.call(this, ...args)
    // return func.apply(this, args)
  }
}

function test(x) {
  return '[test] ' + x
}

test = decorator(test)
console.log(test('A'))

const obj = {
  name: 'obj',
  test(x) {
    // console.log(this)
    return `[${this.name}] [test] ${x}`
  },
}

const obj2 = {
  name: 'obj2',
}

obj2.test = decorator(obj.test)
console.log(obj2.test('X'))


const test2 = obj.test.bind(obj2)
const test2D = decorator(test2)
console.log(test2D('X'))
