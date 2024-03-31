package com.example.foodexpress.screen.main.order.checkout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodexpress.R
import com.example.foodexpress.databinding.ActivityChackoutBinding
import com.example.foodexpress.model.AddressModel
import com.example.foodexpress.screen.main.map.MapsActivity
import com.example.foodexpress.screen.main.restarants.feedbeck.FeedBeckFragment
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class ChackoutActivity : AppCompatActivity() {

    var address: AddressModel? = null
    lateinit var binding: ActivityChackoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChackoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nazad.setOnClickListener {
            finish()
        }

        binding.btnMaps.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

        binding.lyPaymecash.setOnClickListener {
            binding.lyPaymecash.setBackgroundResource(R.drawable.shape_active)
            binding.imgPaymecash.setColorFilter(ContextCompat.getColor(this, R.color.color_accent), android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymecash.setTextColor(ContextCompat.getColor(this, R.color.color_accent))

            binding.lyPaymecard.setBackgroundResource(R.drawable.shape_inactive)
            binding.imgPaymecard.setColorFilter(ContextCompat.getColor(this, R.color.grey_color), android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymecard.setTextColor(ContextCompat.getColor(this, R.color.grey_color))
        }

        binding.lyPaymecard.setOnClickListener {
            binding.lyPaymecard.setBackgroundResource(R.drawable.shape_active)
            binding.imgPaymecard.setColorFilter(ContextCompat.getColor(this, R.color.color_accent), android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymecard.setTextColor(ContextCompat.getColor(this, R.color.color_accent))

            binding.lyPaymecash.setBackgroundResource(R.drawable.shape_inactive)
            binding.imgPaymecash.setColorFilter(ContextCompat.getColor(this, R.color.grey_color), android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymecash.setTextColor(ContextCompat.getColor(this, R.color.grey_color))
        }


        if (!EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().register(this)
        }


        binding.lyPaymecard.setOnClickListener {
            val fragment = TopayFragment.newInstance()
            fragment.show(supportFragmentManager, fragment.tag)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().unregister(this)
        }
    }

    @Subscribe
    fun onEvent(address: AddressModel){
        this.address = address
        binding.edtiAdres.setText("${address.latitude}, ${address.longitude}")
    }
}