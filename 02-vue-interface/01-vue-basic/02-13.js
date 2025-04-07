let obj = { result: 0 };

obj.add = function (x, y) {
    function inner() {
        this.result = x + y; // this는 obj가 아닌 전역 객체를 가리킴
    }
    inner(); // inner()가 일반 호출되었기 때문에 this는 전역 객체(브라우저에서는 window)를 가리킴
};
obj.add(3, 4);

console.log(obj); // { result: 0, add: [Function (anonymous)] }
console.log(result); // 7
