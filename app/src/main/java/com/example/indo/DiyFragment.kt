import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.indo.*

class DiyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val ARG_PARAM1 = "param1"
    private val ARG_PARAM2 = "param2"
    private lateinit var canvasPaintingButton: ImageButton
    private lateinit var plantWallArtButton: ImageButton
    private lateinit var wallArtButton: ImageButton
    private lateinit var wallHangingButton: ImageButton
    private lateinit var wallPhotosButton: ImageButton
    private lateinit var wasteToBestButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_diy, container, false)
        canvasPaintingButton = view.findViewById(R.id.canvas_painting)
        plantWallArtButton = view.findViewById(R.id.plant_wall_art)
        wallArtButton = view.findViewById(R.id.wall_art)
        wallHangingButton = view.findViewById(R.id.wall_hanging)
        wallPhotosButton = view.findViewById(R.id.wall_photos)
        wasteToBestButton = view.findViewById(R.id.waste_to_best)

        canvasPaintingButton.setOnClickListener {
            // launch canvas painting activity
            val intent = Intent(activity, CanvasPainting::class.java)
            startActivity(intent)
        }

        plantWallArtButton.setOnClickListener {
            // launch plant wall art activity
            val intent = Intent(activity, PlantWallArt::class.java)
            startActivity(intent)
        }

        wallArtButton.setOnClickListener {
            // launch wall art activity
            val intent = Intent(activity, WallArt::class.java)
            startActivity(intent)
        }

        wallHangingButton.setOnClickListener {
            // launch wall hanging activity
            val intent = Intent(activity, WallHanging::class.java)
            startActivity(intent)
        }

        wallPhotosButton.setOnClickListener {
            // launch wall photos activity
            val intent = Intent(activity, PhotosArt::class.java)
            startActivity(intent)
        }

        wasteToBestButton.setOnClickListener {
            // launch waste to best activity
            val intent = Intent(activity, WasteToBest::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            var param1: String? = null
            var param2: String? = null
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DiyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
