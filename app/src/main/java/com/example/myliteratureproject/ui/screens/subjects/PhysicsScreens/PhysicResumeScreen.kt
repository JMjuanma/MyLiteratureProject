package com.example.myliteratureproject.ui.screens.subjects.PhysicsScreens

import android.net.wifi.WifiConfiguration.AuthAlgorithm.strings
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myliteratureproject.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun PhysicResumeScreen (navController : NavHostController){

}

@Preview(showSystemUi = true)
@Composable
fun MyBody(){
    LazyColumn(Modifier.width(100.dp).height(400.dp)){
        item{
            Spacer(Modifier.height(30.dp))
        }
        item{
            MyTitle(stringResource(id = R.string.physic_topic_1))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_1))
        }
        item{
            MyParagraph(stringResource(id = R.string.physic_paragraph_1))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_2))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_3))
        }
        item{
            MySubtitle(stringResource(id= R.string.physic_subtopic_4))
        }
        item{
            MyTitle(stringResource(id = R.string.physic_topic_2))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_5))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_6))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_7))
        }
        item{
            MySubtitle(stringResource(id= R.string.physic_subtopic_8))
        }
        item{
            MySubtitle(stringResource(id= R.string.physic_subtopic_9))
        }
        item{
            MyTitle(stringResource(id = R.string.physic_topic_3))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_10))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_11))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_12))
        }
        item{
            MySubtitle(stringResource(id= R.string.physic_subtopic_13))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_14))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_15))
        }
        item{
            MySubtitle(stringResource(id = R.string.physic_subtopic_16))
        }
        item{
            MySubtitle(stringResource(id= R.string.physic_subtopic_17))
        }
        item{
            MySubtitle(stringResource(id= R.string.physic_subtopic_18))
        }
    }
}

@Composable
fun MyTitle(string: String){
    Text(string, Modifier.width(400.dp).padding(start=16.dp, end=16.dp, top=8.dp).size(30.dp), fontFamily= FontFamily.Monospace, fontWeight = FontWeight.W900, textAlign= TextAlign.Center)
    //Spacer(Modifier.width(350.dp).height(2.dp).padding(start = 30.dp).background(color = Color.Black))
}

@Composable
fun MySubtitle(string: String){
    Text(string, Modifier.width(400.dp).padding(start=26.dp, end=16.dp, top=8.dp).size(30.dp), fontFamily= FontFamily.Serif, fontWeight= FontWeight.W600)
    //Spacer(Modifier.width(300.dp).height(1.dp).padding(start = 20.dp).background(color = Color.Black))
}

@Composable
fun MyParagraph(string: String){
    Text(string, Modifier.width(400.dp).padding(start=10.dp, end=16.dp, top=5.dp).size(30.dp), fontFamily= FontFamily.Serif, fontWeight= FontWeight.W400)
}