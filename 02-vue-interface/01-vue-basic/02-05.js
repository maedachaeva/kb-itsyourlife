function addContact(
    name,
    mobile,
    home = '없음',
    address = '없음',
    email = '없음'
) {
    // 백틱과 ${}이 템플릿 문자열
    let print = `name=${name}, mobile=${mobile}, home=${home}, address=${address}, email=${email}`;
    // let print =
    //     'name=' +
    //     name +
    //     ', mobile=' +
    //     mobile +
    //     ', home=' +
    //     home +
    //     ', address=' +
    //     address +
    //     ', email=' +
    //     email;
    console.log(print);
}
addContact('홍길동', '010-222-3331');
addContact('이몽룡', '010-222-3331', '02-3422-9900', '서울시');
