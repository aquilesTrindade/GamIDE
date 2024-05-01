package com.trindade.gamide;

//Android
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//AndroidX
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

//GamIDE
import com.trindade.gamide.gslang.methods.MethodCaller;
import com.trindade.gamide.classes.interpreter.BaseCompiller;
import com.trindade.gamide.ui.fragments.EditorFragment;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle _savedInstanceState) {
    super.onCreate(_savedInstanceState);
    setContentView(R.layout.activity_main);
	EditorFragment fragment = new EditorFragment();
	goToFragment(fragment);
  }
  
  public void goToFragment(Fragment frag){
	  FragmentManager fragmentManager = getSupportFragmentManager();
	  FragmentTransaction transaction = fragmentManager.beginTransaction();
	  transaction.replace(R.id.fragment_container, frag);
	  transaction.addToBackStack(null);
	  transaction.commit();
  }
  
}