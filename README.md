# 🤖 ChatBot GPT-4o – Java Spring Boot + React

Um chatbot inteligente que utiliza a **API da OpenAI (GPT-4o-mini)** integrado com um **backend em Spring Boot** e um **frontend moderno em React**.  
Este projeto demonstra como conectar uma aplicação Java com um frontend interativo para criar uma experiência de conversa em tempo real com IA.

---

## 🚀 Tecnologias Utilizadas

### 🧠 Backend
- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **RestClient**
- **Lombok (opcional)**
- **Maven**

### 💬 Frontend
- **React 18**
- **Axios** para as requisições HTTP
- **Bootstrap 5**
- **CSS Customizado**

---

## ⚙️ Estrutura do Projeto

```
/ChatBot-GPT4o---Java-SpringBoot-React
│
├── backend/ (Spring Boot)
│   ├── src/main/java/com/springboot/chatgpt/
│   │   ├── config/OpenAPIConfiguration.java
│   │   ├── controller/ChatGPTController.java
│   │   ├── dto/*.java
│   │   └── service/ChatGptService.java
│   ├── resources/application.properties
│   └── pom.xml
│
├── frontend/ (React)
│   ├── src/components/chat/ChatBot.jsx
│   ├── src/components/chat/ChatBot.css
│   ├── package.json
│   └── public/
│
└── README.md

```


## 🧩 Arquitetura do Sistema

```
| Camada | Tecnologia | Função |
|--------|-------------|--------|
| **Frontend (React)** | React + Axios | Interface do usuário; envia prompts e exibe respostas. |
| **Backend (Spring Boot)** | Java + Spring | Recebe requisições REST, conecta à API da OpenAI e retorna a resposta. |
| **API Externa** | OpenAI GPT-4o-mini | Motor de IA responsável por gerar as respostas. |

```

## ⚡ Como Rodar o Projeto Localmente

### 🧱 1. Clonar o repositório

```
```bash
git clone https://github.com/seu-usuario/ChatBot-GPT4o---Java-SpringBoot-React.git
cd ChatBot-GPT4o---Java-SpringBoot-React

```

### 2. Configurar o Backend (Spring Boot)

1. Vá até a pasta:
```
cd backend
```

2. No seu application.properties, coloque a chave da API do ChatGpt:

openapi.api.key=SUA_CHAVE_DA_OPENAI_AQUI

Nota: Para obter sua chave, acesse com sua conta e crie sua chave em: https://platform.openai.com/api-keys

3. Inicie o servidor Spring Boot:

```
mvn spring-boot:run

```

O backend rodará por padrão em:
👉 http://localhost:8080

### 💻 3. Configurar o Frontend (React)

1. Vá até a pasta:

```
cd Frontend/chatgpt-react
```

2. Instale as dependências:

```
npm install
```

3. Inicie o app React:

```
npm run dev
```

O React rodará em: http://localhost:5173/

# Demonstração Visual (preview)
<img width="503" height="783" alt="image" src="https://github.com/user-attachments/assets/74df0056-37d4-4917-b731-8b7566d8a67c" />

<img width="1527" height="762" alt="image" src="https://github.com/user-attachments/assets/375bb252-a679-44f2-9452-3d123443e6c7" />


