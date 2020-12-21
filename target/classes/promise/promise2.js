function aFunc() {
  return new Promise(resolve => {
    resolve({a: 'A'})
  })
}

function bFunc() {
  return new Promise(resolve => {
    resolve({b: 'B'})
  })
}

async function f() {
  const a = await aFunc()
  console.log(a)
  const b = await bFunc()
  console.log(b)
  Object.assign(a, b)
  console.log(a)
}

f()




