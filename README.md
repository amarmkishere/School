# School

To get list of students
curl --location --request GET 'http://localhost:8080/school/students'

To create a record
curl --location --request POST 'http://localhost:8080/school/students' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "kat",
  "lastName": "kaif",
  "middleName": "N",
  "level": "2A",
  "sub1": "ENGLISH",
  "sub2": "MATHS",
  "sub3": "SCIENCE",
  "sub4": "SOCIAL",
  "markSub1": 77.0,
  "markSub2": 75.0,
  "markSub3": 87.0,
  "markSub4": 88.0
}'
