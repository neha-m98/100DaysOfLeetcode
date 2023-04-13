/**
 * @param {Function} fn
 */
function memoize(fn) {
  let cache = {};
  let callCount = 0;
  return function(...args) {
    let key = JSON.stringify(args);
    if (key in cache) {
      return cache[key];
    } else {
      let result = fn(...args);
      cache[key] = result;
      callCount++;
      return result;
    }
  }
}



/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */