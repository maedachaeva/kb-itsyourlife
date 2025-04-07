function addContact1({ name, phone, email = '이메일없음', age = 0 }) {
    console.log(name, phone, email, age);
}
addContact1({ name: '이몽룡', phone: '010-3434-8989' });
// 함수 매개변수로 객체를 받고, 그 안에서 구조 분해 할당으로 name, ..., age를 꺼낸다

// 위 코드에서 구조 분해 할당한 부분:
// { name, phone, email = '이메일없음', age = 0 }

// 함수의 매개변수에서 바로 구조 분해한 것

// 구조 분해 없이 쓴다면:
// function addContact1(obj) {
//     const name = obj.name;
//     const phone = obj.phone;
//     const email = obj.email ?? '이메일없음';
//     const age = obj.age ?? 0;
// }

function addContact2(contact) {
    if (!contact.email) contact.email = '이메일없음';
    if (!contact.age) contact.age = 0;
    let { name, phone, email, age } = contact;
    console.log(name, phone, email, age);
}
addContact2({ name: '이몽룡', phone: '010-3434-8989' });

function addContact3(name, phone, email = '이메일없음', age = 0) {
    console.log(name, phone, email, age);
}
addContact3('이몽룡', '010-3434-8989');
