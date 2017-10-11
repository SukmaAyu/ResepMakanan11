package sukma08778.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Recipe> recipeList = new ArrayList<>();
    public RecipeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new RecipeAdapter(this, recipeList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recipeData();
    }

    public void recipeData() {
        Recipe recipe = new Recipe("CUMI CRYSPI SAUS ASAM MANIS", R.drawable.cumi, "So Yummy", "\nBAHAN-BAHAN\n\n" +
                "\t300gr cumi\n" +
                "\t100gr tepung terigu\n" +
                "\t100gr tepung roti/panir\n" +
                "\t1 butir telur dikocok\n" +
                "\tSecukupnya merica\n" +
                "\tSecukpnya garam\n" +
                "\tBahan saus asam manis\n" +
                "\t1/2siung bawang bombay diiris\n" +
                "\t3 siung bawang putih dihaluskan\n" +
                "\t100gr saus tomat\n" +
                "\t2 sdm saus cabe\n" +
                "\t5 biji cabe rawit diiris\n" +
                "\t1 biji tomat dipotong kecil2\n" +
                "\tSecukupnya minyak goreng\n" +
                "\tSecukupnya air\n" +
                "\tSecukupnya garam dan gula\n\n" +
                "\tCARA PEMBUATAN\n\n" +
                "\t1. Potong cumi per 1cm atau sesuai selera, kemudian cuci dan rendam dengan merica dan garam sampai meresap.\n" +
                "\t2. Kemudian balur cumi ke dalam tepung terigu, lalu ke telur kemudian ke tepung roti sampai rata satu persatu,panaskan minyak goreng. sisihkan\n" +
                "\t3. Membuat saus. Panaskan minyak goreng lalu tumis bawang bombay, bawang putih dan cabe rawit hingga harumS.\n" +
                "\t4. Lalu masukan saus tomat, saus cabe, dan tomat. Aduk hingga rata. Tambahkan air, gula dan garam. aduk sampia mendidiih. tiriskan\n" +
                "\t5. Setelah saus matang, masukkan cumi cryspi ke dalam saus. aduk hingga merata. sajikan.\n");

        recipeList.add(recipe);
        recipe = new Recipe("ZUPPA SOUP", R.drawable.soup, "So Creamy", "\n\nBAHAN-BAHAN\n\n" +
                "\tKulit pastry instan \n" +
                "\t1 bungkus royco soup cream ayam\n" +
                "\tPelengkap : \n" +
                "\t2batang sosis\n" +
                "\tSecukupnya brokoli\n" +
                "\tSecukupnya jagung pipil\n" +
                "\tKuning telur untuk olesan\n" +
                "\tLANGKAH-LANGKAH\n\n" +
                "\t1. Rebus air untuk soup cream. Masukkan brokoli, jagung pipil, sosis.\n" +
                "\t2. Aduk-aduk sampai matang, nanti kental sendiri.\n" +
                "\t3. Panaskan oven, potong kulit pastry kotak(sesuaikan cup soup creamnya) kulit pastrynya melebihi cup\n" +
                "\t4. Oles bagian atas kulit pastry dengan kuning telur.\n" +
                "\t5. Panggang sampai kulit pastry mengembang  2kali lipat dan berwarna keemasan.\n");

        recipeList.add(recipe);
        recipe = new Recipe("KUE KAMIR", R.drawable.kamir, "Dorayaki nya Kabupaten Pemalang", "\n\nBAHAN-BAHAN\n\n" +
                "\t1/2 tepung terigu\n" +
                "\t2 butir telur\n" +
                "\t1 sdt ragi instant\n" +
                "\t40 ons gula pasir\n" +
                "\t250cc air\n" +
                "\tgaram secukupnya\n" +
                "\t1 sdt soda kue\n" +
                "\t1/2 sdt vanili bubuk\n" +
                "\tTape singkong 1/2 ons (buang seratnya)" +
                "\tLANGKAH-LANGKAH\n\n" +
                "\t1. Kocok telur kemudian masukan gula pasir, soda kue, ragi instan, vanili bubuk dan tep singkong\n" +
                "\t   tambahkan sedikit demi sedikit sambil diaduk sampai tercampur rata menggunakan tangan\n" +
                "\t2. Setelah adonan merata baru kemudian tambahkan air sedikit demi sedikit sambil diaduk sampi\n" +
                "\t   mendapatkan adonan kue kamir dengan kekntalan yang pas. janga terlalu encer agar tidak luber\n" +
                "\t   dan jangan terlalu pekat agar tidak bentet\n" +
                "\t3. Pukul-pukul adonan agar udara yang terperangkap dapat keluar. tutup adonan kmair dengan kain bersih lalu biarkan\n" +
                "\t   semalaman atau sekitar 10jam\n" +
                "\t4. Setelah 10jam siapkan cetakan kue kamir, olesi dengan margarin lalu tuangkan satu sendok ayur adonan kue kamir dalam cetakan\n" +
                "\t5. Panggang dengan api yang kecil, saat menegluarkan gelembung balik kue kamir dengan spatula atau sendok.\n" +
                "\t6. Agar kamir tebal, adonan jangan ditekan namun biarkan saja samapi kue kamir matang dengan sendirinya. \n" +
                "\t   Angkat, lakukan proses pemanggangan sampai adonan habis.\n" +
                "\t7. sajikan kue kamir selagi hangat agar lebih enak.\n");

        recipeList.add(recipe);
        recipe = new Recipe("NASI GORENG AYAM", R.drawable.nasgor, "enak", "\n\nBAHAN-BAHAN\n\n" +
                "\t1 potong ayam goreng/panggang\n" +
                "\t1 piring nasi\n" +
                "\t2 siung bawang putih \n" +
                "\t2 buah caeb merah\n" +
                "\t1 ruas daun bawang \n" +
                "\tSecukupnya bawang bombay\n" +
                "\tSecukupnya garam\n" +
                "\tSecukupnya kecap\n" +
                "\tLANGKAH-LANGKAH\n\n" +
                "\t1. Buat ayam suwir\n" +
                "\t2. Cincang bawang putih\n" +
                "\t3. Iris cabe merah, daun bawang dan bawang bombay\n" +
                "\t4. Panaskan minyak\n" +
                "\t5. Tumis bawang dan bumbu yang sudah disiapkan\n" +
                "\t6. Masukkan potongan ayam yang sudah disuwir\n" +
                "\t7. Tumis lalu tambahkan nasi putih\n" +
                "\t8. Tambahkan kecap manis dan garam, aduk hingga rata.\n" +
                "\t9. Nasi goreng ayam siap dihidangkan.\n");

        recipeList.add(recipe);

        mAdapter.notifyDataSetChanged();
    }
}
