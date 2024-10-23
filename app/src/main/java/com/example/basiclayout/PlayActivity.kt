package com.example.basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventEnd
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity() {
    Column(modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Kepada Yth,",
            modifier = Modifier.padding(6.dp))
        Text(text = "Atama Cahya F",
            modifier = Modifier.padding(6.dp))
        Spacer(modifier = Modifier.size(30.dp))
        DetailSurat(
            judul = "Nama",
            isinya = "Joko Tingkir"
        )
        DetailSurat(
            judul = "Alamat",
            isinya = "JokoTingkir@gmail.com"
        )
        DetailSurat(
            judul = "No Telp",
            isinya = "08211945678"
        )
        DetailSurat(
            judul = "Keterangan",
            isinya = "DetailSurat(\n" +
                    "            judul = \"Nama\",\n" +
                    "            isinya = \"Joko Tingkir\"\n" +
                    "        )\n" +
                    "        DetailSurat(\n" +
                    "            judul = \"Alamat\",\n" +
                    "            isinya = \"JokoTingkir@gmail.com\"\n" +
                    "        )\n" +
                    "        DetailSurat(\n" +
                    "            judul = \"No Telp\",\n" +
                    "            isinya = \"08211945678\"\n" +
                    "        )"
        )
    }
}

@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(15.dp)
    )
    {
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Text(
                    text = "Daerah Istimewah Yogyakarta",
                    color = Color.White
                )
                Text(
                    text = "FAX : 021-123456, Tlp : 0821-1234-456",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            )
            {
                Image(painter = painterResource(id = R.drawable.diyy),
                contentDescription = null, modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = ""
                )
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul:String, isinya: String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
    )
    {


        Row (
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.1f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }

    }
}
