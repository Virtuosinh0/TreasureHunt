package com.example.treasurehunt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.treasurehunt.screens.HomeScreen
import com.example.treasurehunt.screens.TipQuestionScreen
import com.example.treasurehunt.screens.TreasureScreen
import com.example.treasurehunt.screens.WrongScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "/home",
            ){
                composable("/home"){
                    HomeScreen(
                        screenOne = {navController.navigate("/F1Q1")},
                        screenTwo = {navController.navigate("/PLQ1")}
                        )
                }
                composable("/wrongAnswer"){
                    WrongScreen(goBack = {navController.navigateUp()})
                }
                composable("/treasureFound"){
                    TreasureScreen(goHome = {navController.navigate("/home")})
                }
                composable("/F1Q1") {
                    TipQuestionScreen(
                        question = "O tesouro está escondido em um lugar seco e quente.",
                        rightScreen = { navController.navigate("/F1Q2") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Deserto",
                        answerTwo = "Floresta",
                        answerThree = "Cachoeira",
                        rightAnswer = 1
                    )
                }

                composable("/F1Q2") {
                    TipQuestionScreen(
                        question = "Você encontra um mapa perto de algo construído pelo homem.",
                        rightScreen = { navController.navigate("/F1Q3") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Uma pedra",
                        answerTwo = "Uma cabana abandonada",
                        answerThree = "Uma árvore",
                        rightAnswer = 2
                    )
                }

                composable("/F1Q3") {
                    TipQuestionScreen(
                        question = "O mapa indica que o próximo passo é seguir algo que aponta para o norte.",
                        rightScreen = { navController.navigate("/F1Q4") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Um tronco caído",
                        answerTwo = "Uma bússola quebrada",
                        answerThree = "Uma flecha esculpida em uma rocha",
                        rightAnswer = 3
                    )
                }

                composable("/F1Q4") {
                    TipQuestionScreen(
                        question = "Você precisa atravessar um obstáculo para continuar. Qual é o caminho mais seguro?",
                        rightScreen = { navController.navigate("/F1Q5") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Uma ponte de corda velha",
                        answerTwo = "Um tronco caído sobre um rio",
                        answerThree = "Uma trilha em volta do obstáculo",
                        rightAnswer = 3
                    )
                }

                composable("/F1Q5") {
                    TipQuestionScreen(
                        question = "O tesouro está perto de algo que brilha ao pôr do sol.",
                        rightScreen = { navController.navigate("/F1Q6") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Uma lagoa dourada",
                        answerTwo = "Uma pedra com cristais",
                        answerThree = "Uma caverna escura",
                        rightAnswer = 2
                    )
                }

                composable("/F1Q6") {
                    TipQuestionScreen(
                        question = "A última pista diz que o tesouro está escondido sob algo que oferece sombra.",
                        rightScreen = { navController.navigate("/treasureFound") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Uma grande árvore",
                        answerTwo = "Uma duna de areia",
                        answerThree = "Uma rocha no meio do campo",
                        rightAnswer = 1
                    )
                }

                composable("/F2Q1") {
                    TipQuestionScreen(
                        question = "O tesouro está escondido perto de algo com muitos galhos.",
                        rightScreen = { navController.navigate("/F2Q2") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Uma árvore antiga",
                        answerTwo = "Uma caverna",
                        answerThree = "Uma montanha",
                        rightAnswer = 1
                    )
                }

                composable("/F2Q2") {
                    TipQuestionScreen(
                        question = "A próxima pista diz que há pegadas no chão. Onde procurar?",
                        rightScreen = { navController.navigate("/F2Q3") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Na areia da praia",
                        answerTwo = "No chão da floresta",
                        answerThree = "Nas pedras da montanha",
                        rightAnswer = 2
                    )
                }

                composable("/F2Q3") {
                    TipQuestionScreen(
                        question = "O mapa indica que o tesouro está escondido próximo a um corpo d’água. Onde procurar?",
                        rightScreen = { navController.navigate("/F2Q4") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Em uma cachoeira",
                        answerTwo = "Em um rio",
                        answerThree = "Em um poço antigo",
                        rightAnswer = 3
                    )
                }

                composable("/F2Q4") {
                    TipQuestionScreen(
                        question = "Você vê um símbolo esculpido em pedra. O que ele representa?",
                        rightScreen = { navController.navigate("/F2Q5") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Um sol",
                        answerTwo = "Uma chave",
                        answerThree = "Uma caveira",
                        rightAnswer = 2
                    )
                }

                composable("/F2Q5") {
                    TipQuestionScreen(
                        question = "A chave está escondida em um lugar protegido do vento. Onde procurar?",
                        rightScreen = { navController.navigate("/F2Q6") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "Dentro de uma gruta",
                        answerTwo = "No topo de uma colina",
                        answerThree = "No meio de uma planície",
                        rightAnswer = 1
                    )
                }

                composable("/F2Q6") {
                    TipQuestionScreen(
                        question = "A última pista diz que o tesouro está enterrado onde a luz da lua toca primeiro.",
                        rightScreen = { navController.navigate("/treasureFound") },
                        wrongScreen = { navController.navigate("/wrongAnswer") },
                        answerOne = "No topo de uma duna de areia",
                        answerTwo = "No centro de uma clareira",
                        answerThree = "No fundo de um poço",
                        rightAnswer = 2
                    )
                }
            }
        }
    }
}
