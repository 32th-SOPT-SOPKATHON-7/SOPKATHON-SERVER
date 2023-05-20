# SOPKATHON-SERVER

> 32th GO SOPT SOPKATHON [서비스명] <br>
>
> 32기 솝커톤 Hello world! 프로젝트

<br>

## 🖤 SOPKATHON Server Developers


| 조예슬 | 정동규 |
| :---------:|:----------:|
|<img width="300" alt="image" src="https://github.com/CDS-Mobile1/CDS_Server/assets/68415644/419dcac6-e13d-4d65-b058-250fcd869bff"> | <img width="270" height="330" alt="image" src="https://github.com/32th-SOPT-SOPKATHON-7/SOPKATHON-SERVER/assets/86935274/a92599bb-03e6-492a-bc5f-39b59c5f3394">| 
| [yeseul106](https://github.com/yeseul106) | [yummygyudon](https://github.com/yummygyudon) |

<br/>

### 🚨 응원의 메시지를 담은 파트 팀원들의 사진촬영

<img width="550" height="400" alt="team_image" src="https://github.com/32th-SOPT-SOPKATHON-7/SOPKATHON-SERVER/assets/86935274/b11b96cc-f404-4ef2-8678-1ff7ee09265b">


<br/>
<br/>

## 🗂️ Project Foldering

- **도메인 별로 Architecture를 나눴습니다.**

```
└── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   ├── 📁 common
│   │   │   │   ├── 📁 domain
│   │   │   │   │   └── BaseEntity.java
│   │   │   │   ├── 📁 dto
│   │   │   │   ├── 📁 exception
│   │   │   ├── 📁 config
│   │   │   │   └── JpaAuditingConfig.java
│   │   │   ├── 📁 station
│   │   │   │   ├── 📁 domain
│   │   │   │   ├── 📁 dto
│   │   │   │   ├── 📁 controller
│   │   │   │   ├── 📁 repository
│   │   │   │   ├── 📁 service
│   │   │   ├── 📁 post
│   │   │   ├── 📁 comment
│   │   │   └── ServerApplication.java
│   │   ├── 📁 resources
│   │   │   └── application.yml
└── └── 📁 test
```
<br>

## 📌 ERD
https://www.erdcloud.com/d/bbkASdo8Mx9DePAK6

- 자세한 테이블 정보는 다음 노션 페이지에 정리해두었습니다 !

- [📝 Database](https://sungah.notion.site/Database-a47ba5376b4d4d5d90bbc01864eafbad)

<img width="884" alt="image" src="https://github.com/32th-SOPT-SOPKATHON-7/SOPKATHON-SERVER/assets/68415644/55fa3cdc-9589-4a21-a92f-ad398731ac46">

<br>
<br>

## 🖇 Api 명세서




## 🙋🏻‍♀️ 역할 분담

<div markdown="1">  
 
| 기능명 | 담당자 | 완료 여부 |
| :-----: | :---: | :---: |
| 프로젝트 세팅 | `예슬🌮` | 완료 |
| EC2 세팅 | `예슬🌮` | 완료 |
| RDS 세팅 | `예슬🌮` | 완료 |
| DB 설계 | `예슬🌮` `동규🍣` | 완료 |
| API 명세서 작성 | `예슬🌮` `동규🍣` | 진행 예정 |
| API 개발 | `예슬🌮` `동규🍣` | 진행 예정 |
 
</div>
 <br>

## ✅ Coding Convention

 - [💻 코드 컨벤션](https://sungah.notion.site/Code-Convention-30c62e9b53cc45099b2b13d7cfa245e0)
 
## ✅ Git Convention

### 📌 Commit Convention

  - [💻 커밋 컨벤션](https://yesuri-masuri.notion.site/Git-08bb41f003044937b9cd67b62dc0436b)

<br>

### 📌 Branch Convention

- [develop] : 최종 배포
- [feature] : 기능 추가
- [fix] : 에러 수정, 버그 수정
- [refactor] : 코드 리펙토링 (기능 변경 없이 코드만 수정할 때)
- [modify] : 코드 수정 (기능의 변화가 있을 때)
- [chore] : gradle 세팅, 위의 것 이외에 거의 모든 것

<br>

### 📌 Branch Strategy

   - [💻 Git 브랜치 전략](https://yesuri-masuri.notion.site/Git-08bb41f003044937b9cd67b62dc0436b)

<br>


### 📌 Issue Convention
- [FEAT] : 기능 추가
- [FIX] : 에러 수정, 버그 수정
- [REFACTOR] : 코드 리펙토링 (기능 변경 없이 코드만 수정할 때)
- [CHORE] : gradle 세팅, 위의 것 이외에 거의 모든 것

`ex) [FEAT] 게시물 생성 API`


