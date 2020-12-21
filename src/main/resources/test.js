// const a = new Promise((resolve, reject) => {
//   // reject('Error')
//   resolve('A')
// })
//   .then(data => {
//     console.log(1, data)
//     return 'B'
//   })
//   .then(data => {
//     console.log(2, data)
//     return new Promise((resolve, reject) => {
//       // reject('Error')
//       resolve('C')
//     })
//   })
//   .then(data => {
//     console.log(3, data)
//     return 'D'
//   })
//
//
// a.then(data => {
//   console.log(4, data)
// })
//   .catch(e => {
//     console.error(e)
//   })

// console.log(parseInt(123456.789))
// console.log(parseFloat(123456.789))
// console.log(123456.789.toLocaleString('en',{maximumFractionDigits: 2}))
// console.log(123456 .toLocaleString('en'))
// console.log(123456.789.toFixed(2))

// console.log([-1, 2, 3].find(i => i > 0))


// console.log(parseFloat("-.17%"))
// console.log(parseInt("-.18%"))
// console.log(parseInt(parseFloat("-.18%")))


function trim(x) {
  return x.trim()
}

const composed2 =
  (fn1, fn2) =>
    origValue =>
      fn2(fn1(origValue))

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
