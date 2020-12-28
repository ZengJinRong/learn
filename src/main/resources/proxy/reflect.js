let obj = {
  a: 'a',
  b: ['b'],
}

obj = new Proxy(obj, {
  get(target, p, receiver) {
    console.log('get', p)
    return Reflect.get(target, p, receiver)
  },
  set(target, p, value, receiver) {
    console.log('set', p, value)
    return Reflect.set(target, p, value, receiver)
  },
})

console.log(obj.a)
obj.a = 'A'
console.log(obj.a)
