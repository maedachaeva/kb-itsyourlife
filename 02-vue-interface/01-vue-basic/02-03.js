const p1 = { name: 'john', age: 20 };
p1.age = 22;
console.log(p1); // { name: 'john', age: 22 };

p1 = { name: 'lee', age: 25 }; // const로 선언했기 때문에 에러
