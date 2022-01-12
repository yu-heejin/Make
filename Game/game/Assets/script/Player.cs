using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    public Vector2 speed_vec;
    public float speed;
    public int move_method;
    private int firewood = 0;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
       if(collision.CompareTag("Item"))
        {
            Destroy(collision.gameObject);
            firewood++;
            Debug.Log("The number of firewoods is " + firewood);
        }
    }

    // Update is called once per frame
    void Update()
    {
        if (move_method == 0)
        {
            speed_vec = Vector2.zero;

            if (Input.GetKey(KeyCode.RightArrow))    //오른쪽 키가 눌리면 true
            {
                speed_vec.x += speed;
            }
            if (Input.GetKey(KeyCode.LeftArrow))
            {
                speed_vec.x -= speed;
            }
            if (Input.GetKey(KeyCode.UpArrow))
            {
                speed_vec.y += speed;
            }
            if (Input.GetKey(KeyCode.DownArrow))
            {
                speed_vec.y -= speed;
            }
            transform.Translate(speed_vec);

        } else if(move_method == 1)
        {
            speed_vec.x = Input.GetAxis("Horizontal") * speed;
            speed_vec.y = Input.GetAxis("Vertical") * speed;
            transform.Translate(speed_vec);
        } else if(move_method == 2)
        {
            speed_vec = Vector2.zero;

            if (Input.GetKey(KeyCode.RightArrow))    //오른쪽 키가 눌리면 true
            {
                speed_vec.x += speed;
            }
            if (Input.GetKey(KeyCode.LeftArrow))
            {
                speed_vec.x -= speed;
            }
            if (Input.GetKey(KeyCode.UpArrow))
            {
                speed_vec.y += speed;
            }
            if (Input.GetKey(KeyCode.DownArrow))
            {
                speed_vec.y -= speed;
            }

            GetComponent<Rigidbody2D>().velocity = speed_vec;
        }
    }
}
