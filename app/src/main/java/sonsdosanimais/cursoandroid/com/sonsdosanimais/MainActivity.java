package sonsdosanimais.cursoandroid.com.sonsdosanimais;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//fazemos a implementação do  View.OnClickListener para o codigo não ficar muito repetitivo e identificar qual animal foi clicacado pelo seu ID
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView somCao;
    private ImageView somGato;
    private ImageView somLeao;
    private ImageView somMacaco;
    private ImageView somOvelha;
    private ImageView somVaca;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        somCao = (ImageView) findViewById(R.id.caoID);
        somGato = (ImageView) findViewById(R.id.gatoID);
        somLeao = (ImageView) findViewById(R.id.leaoID);
        somMacaco = (ImageView) findViewById(R.id.macacoID);
        somOvelha = (ImageView) findViewById(R.id.ovelhaID);
        somVaca = (ImageView) findViewById(R.id.vacaID);

        somCao.setOnClickListener(this);
        somGato.setOnClickListener(this);
        somLeao.setOnClickListener(this);
        somMacaco.setOnClickListener(this);
        somOvelha.setOnClickListener(this);
        somVaca.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.caoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                playSom();
                break;

            case R.id.gatoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                playSom();
                break;

            case R.id.leaoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                playSom();
                break;

            case R.id.ovelhaID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                playSom();
                break;

            case R.id.vacaID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                playSom();
                break;

            case R.id.macacoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                playSom();
                break;
        }

    }

    public void playSom(){
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }


}
