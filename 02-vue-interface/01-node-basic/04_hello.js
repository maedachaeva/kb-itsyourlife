function hello(name) {
    if (name == undefined)
        return '이름을 입력하세요.'; //undefined는 예약어이기 때문에 ''로 감싸면 안 됨
    else return name + '님, 안녕하세요?';
}

const result = hello();
console.log(result);
