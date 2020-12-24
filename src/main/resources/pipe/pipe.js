function pipe(...fns) {
  return fns.reduceRight((fn1, fn2) => {
    return function compose(...args) {
      return fn1(fn2(...args))
    }
  })
}

function prop(name, obj) {
  return obj[name]
}

function setProp(name, obj, val) {
  const o = Object.assign({}, obj)
  o[name] = val
  return o
}

function a(x, y) {
  return x + y
}

function b(x) {
  return x + 'b'
}

function c(x) {
  return x + 'c'
}

const ab = pipe(a, b, c)

console.log(ab(2, 3))
