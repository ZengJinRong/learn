/**
 * Simple object check.
 * @param item
 * @returns {boolean}
 */
function isObject(item) {
  return (item && typeof item === 'object' && !Array.isArray(item))
}

/**
 * Deep merge two objects.
 * @param target
 * @param sources
 */
function mergeDeep(target, ...sources) {
  if (!sources.length) {
    return target
  }
  const source = sources.shift()

  if (isObject(target) && isObject(source)) {
    for (const key in source) {
      if (isObject(source[key])) {
        if (!target[key]) {
          Object.assign(target, {[key]: {}})
        }
        mergeDeep(target[key], source[key])
      } else {
        Object.assign(target, {[key]: source[key]})
      }
    }
  }

  return mergeDeep(target, ...sources)
}


const sources = {
  a: 'A',
  b: {
    value: 'B',
  },
  c: ['C'],
  d() {
    return 'D'
  },
}

const target = {}

mergeDeep(target, sources)

sources.a = 'a'
sources.b.value = 'b'
sources.c.push('c')
sources.d = function () {
  return 'd'
}

console.log(target.a)
console.log(target.b)
console.log(target.c)
console.log(target.d())
