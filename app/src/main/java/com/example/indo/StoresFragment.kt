package com.example.indo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class StoresFragment : Fragment() {

    private val ARG_PARAM1 = "param1"
    private val ARG_PARAM2 = "param2"
    private lateinit var canvasprintButton: ImageButton
    private lateinit var PhotoframesButton: ImageButton
    private lateinit var LightingButton: ImageButton
    private lateinit var WallArtStoreButton: ImageButton
    private lateinit var PlantsStoreButton: ImageButton
    private lateinit var PaintsStoresButton: ImageButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stores, container, false)
        canvasprintButton = view.findViewById(R.id.canvasprint)
        PhotoframesButton = view.findViewById(R.id.Photoframes)
        LightingButton = view.findViewById(R.id.Lighting)
        WallArtStoreButton = view.findViewById(R.id.WallArtStore)
        PlantsStoreButton = view.findViewById(R.id.PlantsStore)
        PaintsStoresButton = view.findViewById(R.id.PaintsStores)

        canvasprintButton.setOnClickListener {
            // launch canvas painting activity
            val intent = Intent(activity, CanvasPrintStore::class.java)
            startActivity(intent)
        }

        PhotoframesButton.setOnClickListener {
            // launch plant wall art activity
            val intent = Intent(activity, PhotoFrameStore::class.java)
            startActivity(intent)
        }

        LightingButton.setOnClickListener {
            // launch wall art activity
            val intent = Intent(activity, LightingStore::class.java)
            startActivity(intent)
        }

        WallArtStoreButton.setOnClickListener {
            // launch wall hanging activity
            val intent = Intent(activity, WallArtStores::class.java)
            startActivity(intent)
        }

        PlantsStoreButton.setOnClickListener {
            // launch wall photos activity
            val intent = Intent(activity, PlantsStore::class.java)
            startActivity(intent)
        }

        PaintsStoresButton.setOnClickListener {
            // launch waste to best activity
            val intent = Intent(activity, PaintsStore::class.java)
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
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StoresFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StoresFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}