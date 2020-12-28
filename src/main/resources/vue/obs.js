function observe(value, cb) {
  Object.keys(value).forEach((key) => defineReactive(value, key, value[key], cb))
}


function defineReactive(obj, key, val, cb) {
  const property = Object.getOwnPropertyDescriptor(obj, key)
  if (property && property.configurable === false) {
    return
  }

  const getter = property && property.get
  const setter = property && property.set

  Object.defineProperty(obj, key, {
    enumerable: true,
    configurable: true,
    get: () => {
      return val
    },
    set: newVal => {
      /*通过getter方法获取当前值，与新值进行比较，一致则不需要执行下面的操作*/
      const value = getter ? getter.call(obj) : val
      /* eslint-disable no-self-compare */
      if (newVal === value || (newVal !== newVal && value !== value)) {
        return
      }

      if (setter) {
        /*如果原本对象拥有setter方法则执行setter*/
        setter.call(obj, newVal)
      } else {
        val = newVal
      }

      cb(val)
    },
  })
}

class Vue {
  constructor(options) {
    this._data = options.data
    observe(this._data, options.render)
  }
}

let app = new Vue({
  el: '#app',
  data: {
    text: 'text',
    text2: 'text2',
  },
  render(val) {
    console.log(`render: ${val}`)
  },
})


app = new Proxy(app, {
  get(target, p, receiver) {
    return target._data[p]
  },
  set(target, p, value, receiver) {
    target._data[p] = value
  },
})


console.log('app', app.text)

app.text = '123'

console.log('app', app.text)


app.text = '123'

