const obj = {
  a: 'a',
  b: ['b'],
  _c: 'c',
  f() {
    console.log(this._c)
  },
}

const proxy = new Proxy(obj, {
  get(target, prop) {
    if (prop.startsWith('_')) {
      throw new Error('Access denied')
    }

    let value = target[prop]

    // 若为方法,则绑定原对象,防止处理私有对象时报Access denied错误
    return typeof value === 'function' ? value.bind(target) : `\${${prop}}: ${value}`
  },
  set(target, prop, value) {
    if (prop.startsWith('_')) {
      throw new Error('Access denied')
    }

    target[prop] = `(${value})`
    return true
  },
  deleteProperty(target, prop) {
    if (prop.startsWith('_')) {
      throw new Error('Access denied')
    }

    delete target[prop]
    return true
  },
  ownKeys(target) {
    return Object.keys(target).filter(key => !key.startsWith('_'))
  },
})

console.log(obj.a)
console.log(proxy.a)
proxy.a = 'A'
console.log(obj.a)
console.log(proxy.a)

console.log(Object.keys(proxy))

try {
  delete proxy._c
} catch (e) {
  console.error(e)
}

console.log(proxy)

proxy.f()


