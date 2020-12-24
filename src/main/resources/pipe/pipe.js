function pipe(...fns) {
  return fns.reduceRight((fn1, fn2) => {
    return function compose(...args) {

      // apply 第二个参数 args 仅接受 [类数组对象]
      return fn1.call(this, fn2.call(this, ...args))
    }
  })
}

// function prop(name, obj) {
//   return obj[name]
// }
//
// function setProp(name, obj, val) {
//   const o = Object.assign({}, obj)
//   o[name] = val
//   return o
// }
//
// function a(x, y) {
//   return x + y
// }
//
// function b(x) {
//   return x + 'b'
// }
//
// function c(x) {
//   return x + 'c'
// }
//
// const ab = pipe(a, b, c)
//
// console.log(ab(2, 3))


const obj = {
  name: 'obj',
  a(x, y) {
    return `[${this.name}] [a] ${x} ${y}`
  },
  b(x) {
    return `[${this.name}] [b] ${x}`
  },
}

const obj2 = {
  name: 'obj2',
}

obj2.ab = pipe(obj.a, obj.b)
console.log(obj2.ab('X', 'Y'))

