package com.example.myliteratureproject.ui.screens.subjects.PhysicsScreens

import android.net.wifi.WifiConfiguration.AuthAlgorithm.strings
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
/*@Preview(showSystemUi = true)
@Composable
fun Pre(){
    LazyColumn(
        Modifier
            .width(100.dp)
            .height(400.dp)){
        /*item{ Spacer(Modifier.height(30.dp)) }
        item{ MyTitle(stringResource(id = R.string.physic_topic_1))  }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_1)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_1), 170) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_2)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_2), 170) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_3), 50) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_3)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_4), 70) }
        item{ MySubtitle(stringResource(id= R.string.physic_subtopic_4)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_5), 160) }
        item{ MyTitle(stringResource(id = R.string.physic_topic_2)) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_5)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_6), 130) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_7), 225) }
        item{ Image(painter = painterResource(id= R.drawable.ec_mas), contentDescription = "Fórmulas", Modifier.padding(start=25.dp).size(width=350.dp, height=300.dp)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_8), 80) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_9), 60) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_6)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_10), 130) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_11), 130) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_12), 110) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_13), 130) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_7)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_14), 150) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_15), 100) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_16), 130) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_17), 100) } */
        item{ MySubtitle(stringResource(id= R.string.physic_subtopic_8)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_18), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_19), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_20), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_21), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_22), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_23), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_24), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_25), 400) }
        item{ MySubtitle(stringResource(id= R.string.physic_subtopic_9)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_26), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_27), 400) }
        item{ MyTitle(stringResource(id = R.string.physic_topic_3)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_28), 400) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_10)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_29), 400) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_11)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_30), 400) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_12)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_31), 400) }
        item{ MySubtitle(stringResource(id= R.string.physic_subtopic_13)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_32), 400) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_14)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_33), 400) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_15)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_34), 400) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_35), 400) }
        item{ MySubtitle(stringResource(id = R.string.physic_subtopic_16)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_36), 400) }
        item{ MySubtitle(stringResource(id= R.string.physic_subtopic_17)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_37), 400) }
        item{ MySubtitle(stringResource(id= R.string.physic_subtopic_18)) }
        item{ MyParagraph(stringResource(id = R.string.physic_paragraph_38), 400) }
    }
}

@Composable
fun MyTitle(string: String){
    Text(string,
        Modifier
            .width(400.dp)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp)
            .size(30.dp), fontFamily= FontFamily.Monospace, fontWeight = FontWeight.W900, textAlign= TextAlign.Center)
    //Spacer(Modifier.width(350.dp).height(2.dp).padding(start = 30.dp).background(color = Color.Black))
}

@Composable
fun MySubtitle(string: String){
    Text(string,
        Modifier
            .width(400.dp)
            .padding(start = 26.dp, end = 16.dp, top = 8.dp)
            .size(30.dp), fontFamily= FontFamily.Serif, fontWeight= FontWeight.W600)
    //Spacer(Modifier.width(300.dp).height(1.dp).padding(start = 20.dp).background(color = Color.Black))
}

@Composable
fun MyParagraph(string: String, x: Int){
    Text(string,
        Modifier
            .width(400.dp)
            .height(x.dp)
            .padding(start = 10.dp, end = 16.dp, top = 5.dp)
            .size(30.dp), fontFamily= FontFamily.Serif, fontWeight= FontWeight.W400)
}*/