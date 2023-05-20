# SOPKATHON-SERVER

> 32th GO SOPT SOPKATHON [서비스명] <br>
>
> 32기 솝커톤 Hello world! 프로젝트

<br>

## 🖤 SOPKATHON Server Developers


| 조예슬 | 정동규 |
| :---------:|:----------:|
|<img width="300" alt="image" src="https://github.com/CDS-Mobile1/CDS_Server/assets/68415644/419dcac6-e13d-4d65-b058-250fcd869bff"> | <img width="300" alt="image" src="https://github.com/CDS-Mobile1/CDS_Server/assets/68415644/dd390d83-9088-4c83-80a5-36df1002362d">| 
| [yeseul106](https://github.com/yeseul106) | [yummygyudon](https://github.com/yummygyudon) |



<br>

## 🗂️ Project Foldering

- **도메인 별로 Architecture를 나눴습니다.**

```
└── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   ├── 📁 common
│   │   │   │   ├── 📁 domain
│   │   │   │   │   └── TimeStamped.java
│   │   │   │   ├── 📁 dto
│   │   │   │   ├── 📁 exception
│   │   │   ├── 📁 config
│   │   │   │   └── JpaAuditingConfig.java
│   │   │   ├── 📁 friend
│   │   │   │   ├── 📁 domain
│   │   │   │   ├── 📁 dto
│   │   │   │   ├── 📁 controller
│   │   │   │   ├── 📁 repository
│   │   │   │   ├── 📁 service
│   │   │   ├── 📁 member
│   │   │   ├── 📁 post
│   │   │   ├── 📁 story
│   │   │   ├── 📁 storyTag
│   │   │   └── InstargramServerApplication.java
│   │   ├── 📁 resources
│   │   │   └── application.yml
└── └── 📁 test
```
<br>

## 📌 ERD
https://www.erdcloud.com/d/bbkASdo8Mx9DePAK6

<img width="780" alt="image" src="https://github.com/CDS-Mobile1/CDS_Server/assets/68415644/28b044e3-e6bc-4e2c-9650-7fd2cbf3790f">

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
| DB 설계 | `예슬🌮` `동규🍣` | 진행 예정 |
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


